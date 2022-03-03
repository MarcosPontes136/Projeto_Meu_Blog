import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Post } from '../model/Post';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  constructor(private http: HttpClient) {}

  public getPosts(): Observable<Post[]> {
    return this.http.get<Post[]>('http://localhost:3000/posts')
  }

  public postMensagem(post: Post){
    return this.http.post<Post[]>('http://localhost:3000/posts', post)
  }
}
